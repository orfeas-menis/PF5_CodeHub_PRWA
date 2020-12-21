package pf5.codehub.team5.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.enums.Status;
import pf5.codehub.team5.webapp.form.RepairForm;
import pf5.codehub.team5.webapp.mappers.RepairFormToRepairMapper;
import pf5.codehub.team5.webapp.mappers.RepairToRepairFormMapper;
import pf5.codehub.team5.webapp.mappers.RepairToRepairModelMapper;
import pf5.codehub.team5.webapp.model.RepairModel;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.repository.RepairRepository;
import pf5.codehub.team5.webapp.repository.UserRepository;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepairServiceImpl implements RepairService {

    @Autowired
    private RepairRepository repairRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RepairToRepairModelMapper repairModelMapper;

    @Autowired
    private RepairToRepairFormMapper repairFormMapper;

    @Autowired
    private RepairFormToRepairMapper repairMapper;

    @Override
    public List<RepairModel> findByVat(String vat) {
        Optional<User> user = userRepository.findByVat(vat);
        if (user.isPresent()) {
            return repairRepository
                    .findByUser(user.get())
                    .stream()
                    .map(repair -> repairModelMapper.map(repair))
                    .collect(Collectors.toList());
        } else {
            return new ArrayList<RepairModel>();
        }
    }

    @Override
    public Optional<RepairModel> findById(Long id) {
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
    public List<RepairModel> findByDateTime(String date) {
        try {
            return repairRepository
                    .findByDateTime(LocalDate.parse(date))
                    .stream()
                    .map(repair -> repairModelMapper.map(repair))
                    .collect(Collectors.toList());
        } catch (DateTimeParseException e) {
            return new ArrayList<RepairModel>();
        }
    }

    @Override
    public List<RepairModel> findTodayActiveRepairs() {
        return repairRepository
                .findByDateTime(LocalDate.now())
                .stream()
                .filter(repair -> repair.getStatus() == Status.INPROGRESS)
                .map(repair -> repairModelMapper.map(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<Repair> findByUser(User user) {
        return repairRepository.findByUser(user);
    }

    @Override
    public List<Repair> findByUserId(Long id) {
        Optional<User> optUser = userRepository.findById(id);
        if (optUser.isPresent()) {
            return repairRepository.findByUser(optUser.get());
        } else {
            //Through Exception if the user does not exist
            return repairRepository.findByUser(optUser.get());
        }
    }


    @Override
    public RepairModel createRepair(RepairForm repairForm) {
        Repair repair = repairMapper.map(repairForm);
        Repair newRepair = repairRepository.save(repair);
        return repairModelMapper.map(newRepair);
    }

    @Override
    public List<RepairModel> findFirst10() {
        return repairRepository
                .findFirst10By()
                .stream()
                .map(repair -> repairModelMapper.map(repair))
                .collect(Collectors.toList());
    }

    @Override
    public RepairModel updateRepair(RepairForm repairForm) {
        Repair repair = repairMapper.map(repairForm);
        Repair newRepair = repairRepository.save(repair);
        return repairModelMapper.map(newRepair);
    }

    @Override
    public String deleteById(Long id) {
        Optional<Repair> repair = repairRepository.findById(id);
        if (repair.isPresent()) {
            repairRepository.deleteById(id);
            return "OK";
        } else {
            return "User does not exist";
        }
    }
}
