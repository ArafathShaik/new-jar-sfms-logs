package org.wtt.docker.listener;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.JestResult;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.Index;

public class ResultSender {

	private static JestClient jestClient;

	static {
		String ELASTICSEARCH_URL;
		try {
			ELASTICSEARCH_URL = PropertiesUtility.loadApplicationProperties().getProperty("es.path");
			System.out.println(ELASTICSEARCH_URL);
			final JestClientFactory factory = new JestClientFactory();
			factory.setHttpClientConfig(
					new HttpClientConfig.Builder(ELASTICSEARCH_URL).readTimeout(100000).multiThreaded(true).build());
			jestClient = factory.getObject();
			ResultSender.jestClient = factory.getObject();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void send(final TestStatus testStatus) {
		try {
			System.out.println("Result Sender Logs ");
			System.out.println("Test Status: " + testStatus.getStatus());
			System.out.println("==================================");
			System.out.println("Index " + PropertiesUtility.properties.getProperty("es.index"));
			String esIndex = PropertiesUtility.properties.getProperty("es.index");
			Index index = new Index.Builder(testStatus).index(esIndex).type(esIndex).build();
			JestResult result = ResultSender.jestClient.execute(index);
			System.out.println("Elastic Search Error Message: " + result.getErrorMessage());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
