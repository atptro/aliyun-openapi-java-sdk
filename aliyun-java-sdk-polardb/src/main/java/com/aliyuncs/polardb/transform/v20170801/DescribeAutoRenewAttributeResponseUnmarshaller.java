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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeAutoRenewAttributeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAutoRenewAttributeResponse.AutoRenewAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoRenewAttributeResponseUnmarshaller {

	public static DescribeAutoRenewAttributeResponse unmarshall(DescribeAutoRenewAttributeResponse describeAutoRenewAttributeResponse, UnmarshallerContext context) {
		
		describeAutoRenewAttributeResponse.setRequestId(context.stringValue("DescribeAutoRenewAttributeResponse.RequestId"));
		describeAutoRenewAttributeResponse.setPageNumber(context.integerValue("DescribeAutoRenewAttributeResponse.PageNumber"));
		describeAutoRenewAttributeResponse.setTotalRecordCount(context.integerValue("DescribeAutoRenewAttributeResponse.TotalRecordCount"));
		describeAutoRenewAttributeResponse.setPageRecordCount(context.integerValue("DescribeAutoRenewAttributeResponse.PageRecordCount"));

		List<AutoRenewAttribute> items = new ArrayList<AutoRenewAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeAutoRenewAttributeResponse.Items.Length"); i++) {
			AutoRenewAttribute autoRenewAttribute = new AutoRenewAttribute();
			autoRenewAttribute.setDBClusterId(context.stringValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].DBClusterId"));
			autoRenewAttribute.setRegionId(context.stringValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].RegionId"));
			autoRenewAttribute.setAutoRenewEnabled(context.booleanValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].AutoRenewEnabled"));
			autoRenewAttribute.setDuration(context.integerValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].Duration"));
			autoRenewAttribute.setPeriodUnit(context.stringValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].PeriodUnit"));
			autoRenewAttribute.setRenewalStatus(context.stringValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].RenewalStatus"));

			items.add(autoRenewAttribute);
		}
		describeAutoRenewAttributeResponse.setItems(items);
	 
	 	return describeAutoRenewAttributeResponse;
	}
}