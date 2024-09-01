package com.baek.blog.controller;

import com.baek.blog.entity.Tag;
import com.baek.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tags")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping
    public String getAllTags(Model model) {
        model.addAttribute("tags", tagService.findAll());
        return "tags"; // 태그 목록 페이지 (tags.html)
    }

    @GetMapping("/new")
    public String showCreateTagForm(Model model) {
        model.addAttribute("tag", new Tag());
        return "create-tag"; // 태그 생성 페이지 (create-tag.html)
    }

    @PostMapping
    public String createTag(@ModelAttribute Tag tag) {
        tagService.createTag(tag);
        return "redirect:/tags";
    }

    @GetMapping("/edit/{id}")
    public String showEditTagForm(@PathVariable Long id, Model model) {
        model.addAttribute("tag", tagService.findById(id));
        return "edit-tag"; // 태그 수정 페이지 (edit-tag.html)
    }

    @PostMapping("/edit/{id}")
    public String updateTag(@PathVariable Long id, @ModelAttribute Tag tag) {
        tag.setId(id);
        tagService.updateTag(tag);
        return "redirect:/tags";
    }

    @PostMapping("/delete/{id}")
    public String deleteTag(@PathVariable Long id) {
        tagService.deleteTag(id);
        return "redirect:/tags";
    }
}
