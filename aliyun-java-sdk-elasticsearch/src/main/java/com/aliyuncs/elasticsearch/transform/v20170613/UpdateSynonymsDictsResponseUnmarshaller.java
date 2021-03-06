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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.UpdateSynonymsDictsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateSynonymsDictsResponse.DictList;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateSynonymsDictsResponse.DictList.OssObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSynonymsDictsResponseUnmarshaller {

	public static UpdateSynonymsDictsResponse unmarshall(UpdateSynonymsDictsResponse updateSynonymsDictsResponse, UnmarshallerContext context) {
		
		updateSynonymsDictsResponse.setRequestId(context.stringValue("UpdateSynonymsDictsResponse.RequestId"));

		List<DictList> result = new ArrayList<DictList>();
		for (int i = 0; i < context.lengthValue("UpdateSynonymsDictsResponse.Result.Length"); i++) {
			DictList dictList = new DictList();
			dictList.setName(context.stringValue("UpdateSynonymsDictsResponse.Result["+ i +"].name"));
			dictList.setFileSize(context.longValue("UpdateSynonymsDictsResponse.Result["+ i +"].fileSize"));
			dictList.setType(context.stringValue("UpdateSynonymsDictsResponse.Result["+ i +"].type"));
			dictList.setSourceType(context.stringValue("UpdateSynonymsDictsResponse.Result["+ i +"].sourceType"));

			OssObject ossObject = new OssObject();
			ossObject.setBucketName(context.stringValue("UpdateSynonymsDictsResponse.Result["+ i +"].ossObject.bucketName"));
			ossObject.setKey(context.stringValue("UpdateSynonymsDictsResponse.Result["+ i +"].ossObject.key"));
			ossObject.setEtag(context.stringValue("UpdateSynonymsDictsResponse.Result["+ i +"].ossObject.etag"));
			dictList.setOssObject(ossObject);

			result.add(dictList);
		}
		updateSynonymsDictsResponse.setResult(result);
	 
	 	return updateSynonymsDictsResponse;
	}
}