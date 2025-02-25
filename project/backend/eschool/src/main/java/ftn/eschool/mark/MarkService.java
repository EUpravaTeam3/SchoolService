package ftn.eschool.mark;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarkService {

    private final MarkRepository markRepository;

    public List<Mark> searchMarks(MarkSearchCriteria criteria) {
        return markRepository.searchMarks(criteria);
    }


}
