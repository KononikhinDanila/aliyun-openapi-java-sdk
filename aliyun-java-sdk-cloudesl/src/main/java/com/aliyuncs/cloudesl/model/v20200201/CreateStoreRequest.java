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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateStoreRequest extends RpcAcsRequest<CreateStoreResponse> {
	   

	private String storeName;

	private String parentId;

	private String phone;

	private String userStoreCode;
	public CreateStoreRequest() {
		super("cloudesl", "2020-02-01", "CreateStore", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putBodyParameter("StoreName", storeName);
		}
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putBodyParameter("ParentId", parentId);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putBodyParameter("Phone", phone);
		}
	}

	public String getUserStoreCode() {
		return this.userStoreCode;
	}

	public void setUserStoreCode(String userStoreCode) {
		this.userStoreCode = userStoreCode;
		if(userStoreCode != null){
			putBodyParameter("UserStoreCode", userStoreCode);
		}
	}

	@Override
	public Class<CreateStoreResponse> getResponseClass() {
		return CreateStoreResponse.class;
	}

}