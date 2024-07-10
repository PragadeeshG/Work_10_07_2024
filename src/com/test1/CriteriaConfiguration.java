package com.test1;

public class CriteriaConfiguration {
	private Integer configurationId;
	private String configurationOwner;
	private boolean activeCriteria;
	private Integer configurationTypeId;
	private String configurationType;
	private String configurationStatus;
	private Integer configurationDescription;
	private Integer relativeDependencies;
	private String parentPom;
	private Integer flushInterval;
	private String buildParams;
	private String status;
	private String timeToExecute;

	public CriteriaConfiguration() {

	}

	public CriteriaConfiguration(Integer configurationId, String configurationOwner, boolean activeCriteria,
			Integer configurationTypeId, String configurationType, String configurationStatus,
			Integer configurationDescription, Integer relativeDependencies, String parentPom, Integer flushInterval,
			String buildParams, String status, String timeToExecute) {
		super();
		this.configurationId = configurationId;
		this.configurationOwner = configurationOwner;
		this.activeCriteria = activeCriteria;
		this.configurationTypeId = configurationTypeId;
		this.configurationType = configurationType;
		this.configurationStatus = configurationStatus;
		this.configurationDescription = configurationDescription;
		this.relativeDependencies = relativeDependencies;
		this.parentPom = parentPom;
		this.flushInterval = flushInterval;
		this.buildParams = buildParams;
		this.status = status;
		this.timeToExecute = timeToExecute;
	}

	public Integer getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(Integer configurationId) {
		this.configurationId = configurationId;
	}

	public String getConfigurationOwner() {
		return configurationOwner;
	}

	public void setConfigurationOwner(String configurationOwner) {
		this.configurationOwner = configurationOwner;
	}

	public boolean isActiveCriteria() {
		return activeCriteria;
	}

	public void setActiveCriteria(boolean activeCriteria) {
		this.activeCriteria = activeCriteria;
	}

	public Integer getConfigurationTypeId() {
		return configurationTypeId;
	}

	public void setConfigurationTypeId(Integer configurationTypeId) {
		this.configurationTypeId = configurationTypeId;
	}

	public String getConfigurationType() {
		return configurationType;
	}

	public void setConfigurationType(String configurationType) {
		this.configurationType = configurationType;
	}

	public String getConfigurationStatus() {
		return configurationStatus;
	}

	public void setConfigurationStatus(String configurationStatus) {
		this.configurationStatus = configurationStatus;
	}

	public Integer getConfigurationDescription() {
		return configurationDescription;
	}

	public void setConfigurationDescription(Integer configurationDescription) {
		this.configurationDescription = configurationDescription;
	}

	public Integer getRelativeDependencies() {
		return relativeDependencies;
	}

	public void setRelativeDependencies(Integer relativeDependencies) {
		this.relativeDependencies = relativeDependencies;
	}

	public String getParentPom() {
		return parentPom;
	}

	public void setParentPom(String parentPom) {
		this.parentPom = parentPom;
	}

	public Integer getFlushInterval() {
		return flushInterval;
	}

	public void setFlushInterval(Integer flushInterval) {
		this.flushInterval = flushInterval;
	}

	public String getBuildParams() {
		return buildParams;
	}

	public void setBuildParams(String buildParams) {
		this.buildParams = buildParams;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimeToExecute() {
		return timeToExecute;
	}

	public void setTimeToExecute(String timeToExecute) {
		this.timeToExecute = timeToExecute;
	}

}
