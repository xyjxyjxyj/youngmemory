package com.liuxm.youngmemory.common;

import com.liuxm.youngmemory.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
