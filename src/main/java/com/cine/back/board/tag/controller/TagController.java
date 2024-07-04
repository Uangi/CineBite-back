package com.cine.back.board.tag.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cine.back.board.post.dto.PostResponseDto;
import com.cine.back.board.tag.dto.TagResponseDto;
import com.cine.back.board.tag.service.TagService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/tag")
@RequiredArgsConstructor
public class TagController implements TagControllerDocs {

    private final TagService tagService;

    @Override
    @GetMapping("/list")
    public ResponseEntity<List<TagResponseDto>> getRecentTags() {
        log.info("[GET][/tag/list] - 최근 태그 조회");
        List<TagResponseDto> tagResponseDtos = tagService.getRecentTags();
        return ResponseEntity.ok().body(tagResponseDtos);
    }

    @Override
    @GetMapping("/list/popular")
    public ResponseEntity<List<TagResponseDto>> getPopularTags() {
        log.info("[GET][/tag/list/popular] - 인기 태그 조회");
        throw new UnsupportedOperationException("Unimplemented method 'getPopularTags'");
    }

    @Override
    @GetMapping("/list/post/{tagName}")
    public ResponseEntity<List<PostResponseDto>> getPostsByTag(String tagName) {
        log.info("[GET][/tag/list/popular/{}] - 태그 이름으로 게시물 조회", tagName);
        throw new UnsupportedOperationException("Unimplemented method 'getPostsByTag'");
    }

}
