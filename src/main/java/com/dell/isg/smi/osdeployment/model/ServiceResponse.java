/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dell.isg.smi.osdeployment.model;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.dell.isg.smi.commons.model.server.JobStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(Include.NON_DEFAULT)
@ApiModel(value = "ServiceResponse", description = "This has the detailed description of the result of microservice call. It includes Message, errors if any like Validation errors, error message, XMLConfig the result returned from the DELL Servers for the Server Configuration transaction.")
public class ServiceResponse {

	@ApiModelProperty(hidden = true)
	private HttpStatus status;

	@ApiModelProperty(value = "Response Message.", dataType = "string", required = false)
	private String message;

	@ApiModelProperty(value = "List of Errors.", required = false)
	private List<String> errors;

	@ApiModelProperty(value = "Error message", dataType = "string", required = false)
	private String error;

	@ApiModelProperty(value = "ISO name", dataType = "string", required = false)
	private String isoName;

	@ApiModelProperty(value = "Server address", dataType = "string", required = false)
	private String serverAddress;
	
	@ApiModelProperty(value = "jobId", dataType = "string", required = false)
	private String jobId;
	
	@ApiModelProperty(value = "Description", dataType = "string", required = false)
	private String description;
	
	@ApiModelProperty(value = "JobStatus", dataType = "JobStatus", required = false)
	private JobStatus jobStatus;
	
	
	public ServiceResponse(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

    public ServiceResponse(HttpStatus status, String message, String isoName) {
        super();
        this.status = status;
        this.message = message;
        this.isoName = isoName;
    }

    public ServiceResponse(HttpStatus status, String message, JobStatus jobStatus) {
        super();
        this.status = status;
        this.message = message;
        this.jobStatus = jobStatus;
    }

    public ServiceResponse(HttpStatus status, String message, List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

/* Fix duplicate signature issue
    public ServiceResponse(HttpStatus status, String message, String error) {
		super();
		this.status = status;
		this.message = message;
		this.error = error;
	}
*/
	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the errors
	 */
	public List<String> getErrors() {
		return errors;
	}

	/**
	 * @param errors
	 *            the errors to set
	 */
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getIsoName() {
		return isoName;
	}

	public void setIsoName(String isoName) {
		this.isoName = isoName;
	}

	/**
	 * @return the serverAddress
	 */
	public String getServerAddress() {
		return serverAddress;
	}

	/**
	 * @param serverAddress the serverAddress to set
	 */
	public void setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}

	/**
	 * @return the jobId
	 */
	public String getJobId() {
		return jobId;
	}

	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
