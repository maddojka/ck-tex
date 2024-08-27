package com.soroko.cktex.controller;

import com.soroko.cktex.dto.RequestDTO;
import com.soroko.cktex.entity.Response;
import com.soroko.cktex.service.DataService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuriy.soroko
 */
@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Controller {
    final DataService dataService;

    /**
     *
     * @param requestDTO dto object that need to deliver
     * @return response of the method: if everything is ok response returns modified value otherwise system
     * returns 418 - I'm teapot
     */
    @PostMapping("/modify")
    public ResponseEntity<Response> modify(@RequestBody RequestDTO requestDTO) {
        if (requestDTO == null) return ResponseEntity.status(HttpStatusCode.valueOf(418)).build();
        return new ResponseEntity<>(dataService.modify(requestDTO), HttpStatusCode.valueOf(200));

    }
}
