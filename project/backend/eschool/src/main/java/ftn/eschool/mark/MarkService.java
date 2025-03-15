package ftn.eschool.mark;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarkService {

    private final MarkRepository markRepository;

    public List<Mark> searchMarks(SearchMarkCriteria criteria) {
        return markRepository.searchMarks(criteria);
    }

    public Mark saveMark(Mark newMark) {
        return markRepository.save(newMark);
    }
}
