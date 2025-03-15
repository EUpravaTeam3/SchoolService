package ftn.eschool.mark;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("marks")
public class MarkController {

    private final MarkService markService;
    private final MarkMapper markMapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MarkResponse> getMarks(@RequestBody SearchMarkCriteria criteria) {
        return markMapper.toMarkResponse(markService.searchMarks(criteria));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MarkResponse saveMark(@Valid @RequestBody SaveMarkRequest saveMarkRequest) {

        Mark newMark = markMapper.toMark(saveMarkRequest);
        Mark savedMark = markService.saveMark(newMark);
        return markMapper.toMarkResponse(savedMark);
    }


}
