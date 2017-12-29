
package com.google.api.services.gmail;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;

import com.google.api.services.gmail.model.ListMessagesResponse;
import com.google.api.services.gmail.model.Message;
import com.google.api.services.gmail.model.MessagePartBody;


public class Gmail {
    public static class Builder {
        public Builder(HttpTransport http,
                       JsonFactory json,
                       GoogleAccountCredential cred) { }
        public Builder setApplicationName(String s) { return this; }
        public Gmail build() { return new Gmail(); }
    }

    public static class Users {
        public static class Messages {
            public static class Attachments {
                public static class Get {
                    public MessagePartBody execute() {
                        return new MessagePartBody();
                    }
                }

                public Get get(String i1, String i2, String i3) {
                    return new Get();
                }
            }

            public static class Get {
                public Message execute() { return new Message(); }
            }

            public static class List {
                public List setQ(String q) { return this; }
                public ListMessagesResponse execute() {
                    return new ListMessagesResponse();
                }
            }

            public List list(String id) { return new List(); }
            public Get get(String id1, String id2) { return new Get(); }
            public Attachments attachments() { return new Attachments(); }
        }

        public Messages messages() { return new Messages(); }
    }

    public Users users() { return new Users(); }
}
