
package com.google.api.services.gmail.model;

import java.util.List;
import java.util.ArrayList;

public class MessagePart {
    public MessagePartBody getBody() { return new MessagePartBody(); }
    public List<MessagePart> getParts() { return new ArrayList<MessagePart>(); }
    public List<MessagePartHeader> getHeaders() {
        return new ArrayList<MessagePartHeader>();
    }
    public String getPartId() { return "0"; }
    public String getFilename() { return "none"; }
}
