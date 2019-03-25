package com.github.uuidcode.lombok.test;

import org.junit.Test;

import com.github.uuidcode.util.CoreUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProjectTest {
    @Test
    public void test() {
        Project project = new Project();
        project.setProjectId(100L);
        this.debug(project);
    }

    @Test
    public void build() {
        Project project = Project.builder()
            .projectId(100L)
            .build();
        this.debug(project);
    }

    private void debug(Project project) {
        if (log.isDebugEnabled()) {
            log.debug(">>> build project: {}", CoreUtil.toJson(project));
            log.debug(">>> build getProjectId: {}", CoreUtil.toJson(project.getProjectId()));
        }
    }
}