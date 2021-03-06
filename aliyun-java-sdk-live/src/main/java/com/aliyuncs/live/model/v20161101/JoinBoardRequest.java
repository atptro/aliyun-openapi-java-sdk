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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class JoinBoardRequest extends RpcAcsRequest<JoinBoardResponse> {
	
	public JoinBoardRequest() {
		super("live", "2016-11-01", "JoinBoard", "live");
	}

	private String boardId;

	private String appUid;

	private Long ownerId;

	private String appId;

	public String getBoardId() {
		return this.boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
		if(boardId != null){
			putQueryParameter("BoardId", boardId);
		}
	}

	public String getAppUid() {
		return this.appUid;
	}

	public void setAppUid(String appUid) {
		this.appUid = appUid;
		if(appUid != null){
			putQueryParameter("AppUid", appUid);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<JoinBoardResponse> getResponseClass() {
		return JoinBoardResponse.class;
	}

}
