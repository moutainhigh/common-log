package com.leeyom.log.api;


import com.leeyom.log.common.dto.ApiResponse;
import com.leeyom.log.common.enums.IStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (User)表控制层
 *
 * @author Leeyom Wang
 * @since 2020-05-30 16:17:37
 */
@RestController
@RequestMapping("test")
public class TestController {


    @GetMapping("/hello")
    public ApiResponse<IStatus> hello() {
        return ApiResponse.ofMessage("hello world");
    }
}