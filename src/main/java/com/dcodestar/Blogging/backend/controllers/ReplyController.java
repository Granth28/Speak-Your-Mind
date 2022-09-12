package com.dcodestar.Blogging.backend.controllers;

import com.dcodestar.Blogging.backend.models.Reply;
import com.dcodestar.Blogging.backend.repositories.ReplyRepository;
import com.dcodestar.Blogging.backend.services.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReplyController {
    @Autowired
    ReplyRepository replyRepository;

    @Autowired
    ReplyService replyService;

    @PostMapping("/reply")
    public String saveReply(@RequestBody Reply replyObject){
        replyRepository.save(replyObject);
        return "success";
    }

    @GetMapping("/reply/{id}")
    public Reply getReply(@PathVariable("id") Integer replyId) {
        return replyRepository.findById(replyId).orElse(null);
    }
    @GetMapping("/reply_id")
    public  String getSingleReply(@RequestParam Integer reply_id){
        return replyService.getSingleReply(reply_id);
    }

    @DeleteMapping("/reply_id")
    public String deleteReply(@RequestParam Integer reply_id){return replyService.delete(reply_id);}
}
