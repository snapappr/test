package org.jboss.tools.example.springmvc.repo;

import java.util.List;

import org.jboss.tools.example.springmvc.domain.Member;
import org.jboss.tools.example.springmvc.domain.UserStock;

public interface UserStockDao
{
    public UserStock findById(Long id);

    public List<UserStock> findByDeviceId(String deviceId);

    public List<UserStock> findByAccountDeviceId(String accoundId,String deviceId);
    public List<UserStock> findAllOrderedByName();

    public void register(UserStock userStock);
    public void delete(UserStock userStock);

    public int removeByAccountDeviceId(String accoundId,String deviceId);
    
}
