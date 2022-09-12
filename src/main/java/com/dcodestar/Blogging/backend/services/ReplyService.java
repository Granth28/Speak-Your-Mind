package com.dcodestar.Blogging.backend.services;

import com.dcodestar.Blogging.backend.models.Reply;

public interface ReplyService {

    String save(Reply reply);
    String delete(Integer id);
    String getSingleReply(Integer id);
}
