package ftn.eschool.mark;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("marks")
public class MarkController {

    private final MarkService markService;
    private final MarkMapper markMapper;

    @GetMapping
    public List<MarkResponse> getMarks(@RequestBody MarkSearchCriteria criteria) {
        return markMapper.toMarkResponse(markService.searchMarks(criteria));
    }

}
