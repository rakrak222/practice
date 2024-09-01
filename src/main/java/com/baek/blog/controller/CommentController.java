package com.baek.blog.controller;

import com.baek.blog.entity.Comment;
import com.baek.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/new")
    public String createComment(@ModelAttribute Comment comment, Principal principal) {
        comment.setUserId(Long.valueOf(principal.getName())); // 로그인한 사용자의 ID를 설정
        commentService.createComment(comment);
        return "redirect:/posts/" + comment.getPostId();
    }

    @GetMapping("/edit/{id}")
    public String showEditCommentForm(@PathVariable Long id, Model model) {
        Comment comment = commentService.findById(id);
        model.addAttribute("comment", comment);
        return "edit-comment"; // 댓글 수정 페이지 (edit-comment.html)
    }

    @PostMapping("/edit/{id}")
    public String updateComment(@PathVariable Long id, @ModelAttribute Comment comment) {
        comment.setId(id);
        commentService.updateComment(comment);
        return "redirect:/posts/" + comment.getPostId();
    }

    @PostMapping("/delete/{id}")
    public String deleteComment(@PathVariable Long id) {
        Comment comment = commentService.findById(id);
        commentService.deleteComment(id);
        return "redirect:/posts/" + comment.getPostId();
    }
}
