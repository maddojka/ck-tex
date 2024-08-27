package com.soroko.cktex.service;

import com.soroko.cktex.dto.RequestDTO;
import com.soroko.cktex.entity.Response;
import com.soroko.cktex.entity.Request;
import com.soroko.cktex.repository.DataRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

/**
 * @author yuriy.soroko
 */
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DataService {
    final DataRepository dataRepository;

    /**
     *
     * @param requestDTO dto object that need to deliver and transfor to request entity
     * @return returns response of the method (current value)
     */
    public Response modify(RequestDTO requestDTO) {
        Request request = dataRepository.getReferenceById(requestDTO.id());
        request.getObj().setCurrent(request.getObj().getCurrent() + requestDTO.add());
        dataRepository.save(request);
        Response response = new Response();
        response.setCurrent(request.getObj().getCurrent());
        return response;
    }
}
