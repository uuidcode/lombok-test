package com.github.uuidcode.lombok.test;

import org.junit.Test;
import org.slf4j.Logger;

import com.github.uuidcode.util.CoreUtil;

import static org.slf4j.LoggerFactory.getLogger;

public class ProjectTest {
    protected static Logger logger = getLogger(ProjectTest.class);

    @Test
    public void test() {
        Project project = new Project();
        project.setProjectId(100L);

        if (logger.isDebugEnabled()) {
            logger.debug(">>> build project: {}", CoreUtil.toJson(project));
        }
    }

    @Test
    public void build() {
        Project project = Project.builder()
            .projectId(100L)
            .build();

        if (logger.isDebugEnabled()) {
            logger.debug(">>> build project: {}", CoreUtil.toJson(project));
        }
    }
}