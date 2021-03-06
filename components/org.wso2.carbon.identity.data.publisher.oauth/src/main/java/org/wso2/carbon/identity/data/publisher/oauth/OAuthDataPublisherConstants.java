/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.data.publisher.oauth;

public class OAuthDataPublisherConstants {
    private OAuthDataPublisherConstants() {
    }

    public static final String OAUTH_TOKEN_ISSUANCE_DAS_DATA_PUBLISHER = "OauthTokenIssuanceDASDataPublisher";
    public static final String OAUTH_TOKEN_VALIDATION_DAS_DATA_PUBLISHER = "OauthTokenValidationDASDataPublisher";
    public static final String OAUTH_TOKEN_REVOCATION_DAS_DATA_PUBLISHER = "OauthTokenRevocationDASDataPublisher";
    public static final String TOKEN_ISSUE_EVENT_STREAM_NAME = "org.wso2.is.analytics.stream.OauthTokenIssuance:1.0.0";
    public static final String TOKEN_VALIDATION_EVENT_STREAM_NAME = "org.wso2.is.analytics.stream.OauthTokenValidation:1.0.0";
    public static final String TOKEN_REVOKE_EVENT_STREAM_NAME = "org.wso2.is.analytics.stream.OauthTokenRevocation:1.0.0";

    public static final String NOT_AVAILABLE = "NOT_AVAILABLE";
    public static final String TENANT_ID = "TENANT_ID";
}
