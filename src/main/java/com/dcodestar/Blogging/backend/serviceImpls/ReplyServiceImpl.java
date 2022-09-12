package com.dcodestar.Blogging.backend.serviceImpls;

import com.dcodestar.Blogging.backend.models.Reply;
import com.dcodestar.Blogging.backend.repositories.ReplyRepository;
import com.dcodestar.Blogging.backend.services.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    ReplyRepository replyRepository;

    @Override
    public String save(Reply reply){
        replyRepository.save(reply);
        return "success";
    }

    @Override
    public String delete(Integer id){
        replyRepository.deleteById(id);
        return "success";
    }

    @Override
    public String getSingleReply(Integer id) {
        Reply reply = replyRepository.findById(id).orElse(null);
        if(reply!=null){
            return reply.getReplyBody();
        }else{
            return null;
        }
    }


}
