package com.controller;

import com.encryptionTool.AESCipher;
import com.encryptionTool.Message;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("encryption")
public class EncryptionController {

    @Path("/encrypt")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message encrypt(Message request){
        AESCipher cipher = new AESCipher("xuwAMrtGPhG5xkf6-T6aBQ");
        Message respond = new Message();
        respond.setMessage(cipher.encrypt(request.getMessage()));
        return respond;
    }

    @Path("/decrypt")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message decrypt(Message request){
        AESCipher cipher = new AESCipher("xuwAMrtGPhG5xkf6-T6aBQ");
        Message respond = new Message();
        respond.setMessage(cipher.decrypt(request.getMessage()));
        return respond;
    }
}
