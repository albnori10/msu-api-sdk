package com.github.msu.sdk.request;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryMerchantContentResponse;
import com.github.msu.sdk.util.ResponseInfo;

import java.util.Map;

@ResponseInfo(responseClass = QueryMerchantContentResponse.class)
public class QueryMerchantContentRequest extends ApiRequest {
    private String merchantContentId;
    private String messageContentType;
    private String language;

    private QueryMerchantContentRequest(QueryMerchantContentRequestBuilder builder) {
        this.merchantContentId = builder.merchantContentId;
        this.messageContentType = builder.messageContentType;
        this.language = builder.language;
    }

    public static QueryMerchantContentRequestBuilder builder() {
        return new QueryMerchantContentRequestBuilder();
    }

    @Override
    public Map<String, String> getFormUrlEncodedData() {
        addToPayload(Param.ACTION, Action.QUERYMERCHANTCONTENT.name());
        addToPayload(Param.MERCHANTCONTENTID, this.merchantContentId);
        addToPayload(Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(Param.LANGUAGE, this.language);
        return payload;
    }

    public static class QueryMerchantContentRequestBuilder {
        private String merchantContentId;
        private String messageContentType;
        private String language;
        private Authentication authentication;

        public QueryMerchantContentRequestBuilder withMerchantContentId(String merchantContentId) {
            this.merchantContentId = merchantContentId;
            return this;
        }

        public QueryMerchantContentRequestBuilder withMessageContentType(String messageContentType) {
            this.messageContentType = messageContentType;
            return this;
        }

        public QueryMerchantContentRequestBuilder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public QueryMerchantContentRequestBuilder withAuthentication(Authentication authentication){
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantContentRequest build() {
            return new QueryMerchantContentRequest(this);
        }
    }
}
