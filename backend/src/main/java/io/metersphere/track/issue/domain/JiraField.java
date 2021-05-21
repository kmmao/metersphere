package io.metersphere.track.issue.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JiraField {

    private String id;
    private String key;
    private String name;
    private boolean custom;
//    private boolean orderable;
//    private boolean navigable;
//    private boolean searchable;
//    private List<String> clauseNames;
//    private Schema schema;
//
//    @Getter
//    @Setter
//    public class Schema {
//        private String type;
//        private String system;
//    }
}