package com.github.msu.sdk.generator;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.github.msu.sdk.generator.MsuApiMetadata.Action;
import com.github.msu.sdk.generator.MsuApiMetadata.Action.Params;

public class RequestGeneratorTest {
	MsuApiMetadataLoader metadataLoader;

	@Before
	public void setUp() {
		metadataLoader = new MsuApiMetadataLoader();
	}

	@Test
	public void testMetadataLoader() {
		List<Action> actions = metadataLoader.getMsuApiMetadata().getAction();
		actions.forEach(action -> {
			System.out.println("Action: " + action.getName());
			Params params = action.getParams();
			params.param.forEach(param -> {
				System.out.println(param.getName() + ":" + param.getType());
			});
			System.out.println("------------------------------------------------------------");
		});
	}
}
