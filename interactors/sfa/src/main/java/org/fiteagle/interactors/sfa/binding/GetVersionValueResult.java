package org.fiteagle.interactors.sfa.binding;

import java.util.ArrayList;
import java.util.List;

public class GetVersionValueResult {
	private String geni_api = "2";
	private GeniAPIVersions api_versions = new GeniAPIVersions();
	private List<GeniRequestRSpecVersions> geni_request_rspec_versions = new ArrayList<>();
	private List<GeniAdRSpecVersions> geni_ad_rspec_versions = new ArrayList<>();

	public GetVersionValueResult() {
		this.geni_request_rspec_versions.add(new GeniRequestRSpecVersions());
	}

	public List<GeniRequestRSpecVersions> getGeni_request_rspec_versions() {
		return geni_request_rspec_versions;
	}

	public void setGeni_request_rspec_versions(
			List<GeniRequestRSpecVersions> geni_request_rspec_versions) {
		this.geni_request_rspec_versions = geni_request_rspec_versions;
	}

	public List<GeniAdRSpecVersions> getGeni_ad_rspec_versions() {
		return geni_ad_rspec_versions;
	}

	public void setGeni_ad_rspec_versions(
			List<GeniAdRSpecVersions> geni_ad_rspec_versions) {
		this.geni_ad_rspec_versions = geni_ad_rspec_versions;
	}

	public String getGeni_api() {
		return geni_api;
	}

	public void setGeni_api(String geni_api) {
		this.geni_api = geni_api;
	}

	public GeniAPIVersions getApi_versions() {
		return api_versions;
	}

	public void setApi_versions(GeniAPIVersions api_versions) {
		this.api_versions = api_versions;
	}

}