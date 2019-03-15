/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenPrivateZoneRoutesRequest extends RpcAcsRequest<DescribeCenPrivateZoneRoutesResponse> {
	
	public DescribeCenPrivateZoneRoutesRequest() {
		super("Cbn", "2017-09-12", "DescribeCenPrivateZoneRoutes", "cbn");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String cenId;

	private Integer pageSize;

	private String hostRegionId;

	private String accessRegionId;

	private Integer pageNumber;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getHostRegionId() {
		return this.hostRegionId;
	}

	public void setHostRegionId(String hostRegionId) {
		this.hostRegionId = hostRegionId;
		if(hostRegionId != null){
			putQueryParameter("HostRegionId", hostRegionId);
		}
	}

	public String getAccessRegionId() {
		return this.accessRegionId;
	}

	public void setAccessRegionId(String accessRegionId) {
		this.accessRegionId = accessRegionId;
		if(accessRegionId != null){
			putQueryParameter("AccessRegionId", accessRegionId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<DescribeCenPrivateZoneRoutesResponse> getResponseClass() {
		return DescribeCenPrivateZoneRoutesResponse.class;
	}

}
