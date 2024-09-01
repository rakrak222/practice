package com.baek.blog.controller;

import com.baek.blog.entity.Post;
import com.baek.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "index"; // 블로그 글 목록을 보여주는 페이지 (index.html)
    }

    @GetMapping("/{id}")
    public String getPostById(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.findById(id));
        return "post"; // 블로그 글 상세 페이지 (post.html)
    }

    @GetMapping("/new")
    public String showCreatePostForm(Model model) {
        model.addAttribute("post", new Post());
        return "create-post"; // 블로그 글 작성 페이지 (create-post.html)
    }

    @PostMapping
    public String createPost(@ModelAttribute Post post, Principal principal) {
        post.setUserId(Long.valueOf(principal.getName())); // 로그인한 사용자의 ID를 설정
        postService.createPost(post);
        return "redirect:/posts";
    }

    @GetMapping("/edit/{id}")
    public String showEditPostForm(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.findById(id));
        return "edit-post"; // 블로그 글 수정 페이지 (edit-post.html)
    }

    @PostMapping("/edit/{id}")
    public String updatePost(@PathVariable Long id, @ModelAttribute Post post) {
        post.setId(id);
        postService.updatePost(post);
        return "redirect:/posts/" + id;
    }

    @PostMapping("/delete/{id}")
    public String deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return "redirect:/posts";
    }
}
