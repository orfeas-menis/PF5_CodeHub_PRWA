package pf5.codehub.team5.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.mappers.RepairToRepairModelMapper;
import pf5.codehub.team5.webapp.model.RepairModel;
import pf5.codehub.team5.webapp.repository.RepairRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepairServiceImpl implements  RepairService{

    @Autowired
    private RepairRepository repairRepository;

    @Autowired
    private RepairToRepairModelMapper repairModelMapper;

    @Override
    public Optional<RepairModel> findRepair(Long id){
        return repairRepository
                .findById(id)
                .map(repair -> repairModelMapper.map(repair));
    }

    @Override
    public List<RepairModel> findAll() {
        return repairRepository
                .findAll()
                .stream()
                .map(repair -> repairModelMapper.map(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByDateTime(Date date) {
        return repairRepository
                .findByDateTime(date)
                .stream()
                .map(repair -> repairModelMapper.map(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findRecentRepairs(){
        return repairRepository
                .findRecentRepairs()
                .stream()
                .map(repair -> repairModelMapper.map(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<Repair> findByUser(User user){
        return repairRepository.findByUser(user);
    }

}
