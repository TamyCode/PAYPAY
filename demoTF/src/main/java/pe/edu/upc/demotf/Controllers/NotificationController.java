package pe.edu.upc.demotf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.dtos.AccountBankingDTO;
import pe.edu.upc.demotf.dtos.NotificationDTO;
import pe.edu.upc.demotf.entities.AccountBanking;
import pe.edu.upc.demotf.entities.Notification;
import pe.edu.upc.demotf.servicesinterfaces.IAccountBankingService;
import pe.edu.upc.demotf.servicesinterfaces.INotificationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
public class NotificationController {
    @Autowired
    private INotificationService nS;
    @PostMapping
    public void registrar(@RequestBody NotificationDTO nt){
        ModelMapper m=new ModelMapper();
        Notification ab=m.map(nt,Notification.class);
        nS.insert(ab);
    }
    @PutMapping
    public void modificar(@RequestBody NotificationDTO nt){
        ModelMapper m=new ModelMapper();
        Notification n=m.map(nt,Notification.class);
        nS.insert(n);
    }
    @GetMapping
    public List<NotificationDTO> list(){
        return nS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,NotificationDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){nS.delete(id);}

    public NotificationDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        NotificationDTO dto=m.map(nS.lisId(id),NotificationDTO.class);
        return dto;
    }
}