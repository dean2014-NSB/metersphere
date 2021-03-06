package io.metersphere.reportstatistics.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TestCaseCountResponse {
    private TestAnalysisChartDTO barChartDTO;
    private PieChartDTO pieChartDTO;
    private List<TestCaseCountTableDTO> tableDTOs;

    public TestCaseCountResponse() {

    }

    public TestCaseCountResponse(TestAnalysisChartDTO chartDTO, PieChartDTO pieChartDTO, List<TestCaseCountTableDTO> tableDTOs) {
        this.pieChartDTO = pieChartDTO;
        this.barChartDTO = chartDTO;
        this.tableDTOs = tableDTOs;
    }
}
