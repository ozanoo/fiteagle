package org.fiteagle.interactors.sfa;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Map;
import java.util.Scanner;

import org.fiteagle.interactors.sfa.binding.GetVersionResult;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SFAInteractor implements ISFA {

	@Override
	public Map<String, Object> getVersion() throws IOException {
		final GetVersionResult resultObject = new GetVersionResult();
		final Map<String, Object> resultMap = this.convertToMap(resultObject);
		return resultMap;
	}

	@SuppressWarnings("unchecked")
	private Map<String, Object> convertToMap(final Object getVersionResult)
			throws IOException {
		final ObjectMapper mapper = new ObjectMapper();
		final StringWriter writer = new StringWriter();

		mapper.writeValue(writer, getVersionResult);
		final Map<String, Object> result = mapper.readValue(writer.toString(),
				Map.class);

		return result;
	}

	@Override
	public String getVersion2() throws IOException {
		InputStream in = this.getClass().getResourceAsStream("/org/fiteagle/interactor/sfa/getversion_result.xml");
		return convertStreamToString(in);
	}
	
	private static String convertStreamToString(InputStream is) {
		Scanner s = new Scanner(is).useDelimiter("\\A");
		return s.hasNext() ? s.next() : "";
	}
}
