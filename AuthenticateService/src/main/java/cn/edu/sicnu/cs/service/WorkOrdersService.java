package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Workorders;

import java.util.List;
import java.util.Map;

public interface WorkOrdersService {
    void InsertWorkOrder(Workorders workOrders);

    List<Map<String,Object>> FindSelfWorkOrderSubmit(String fid);

    Workorders FindSelfWorkOrder(String wid);
}
