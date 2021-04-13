package io.metersphere.base.domain;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TestCaseFieldTemplateWithBLOBs extends TestCaseFieldTemplate implements Serializable {
    private String stepDescription;

    private String expectedResult;

    private String actualResult;

    private static final long serialVersionUID = 1L;
}