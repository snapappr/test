package org.jboss.tools.example.springmvc.repo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.jboss.tools.example.springmvc.domain.Member;
import org.jboss.tools.example.springmvc.domain.UserStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserStockDaoImpl implements UserStockDao
{
    @Autowired
    private EntityManager em;

    public UserStock findById(Long id)
    {
        return em.find(UserStock.class, id);
    }


	@Override
    public List<UserStock> findByDeviceId(String deviceId)
    {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<UserStock> criteria = builder.createQuery(UserStock.class);
        Root<UserStock> member = criteria.from(UserStock.class);

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        criteria.select(member).where(builder.equal(member.get("deviceid"), deviceId));
        return em.createQuery(criteria).getResultList();
        //return em.createQuery(criteria).getSingleResult();
    }


	@Override
    public List<UserStock> findByAccountDeviceId(String accountId, String deviceId)
    {
		if(accountId.trim().equals("") && deviceId.trim().equals(""))
			return null;
		else
		{
        CriteriaBuilder builder = em.getCriteriaBuilder();
        
        CriteriaQuery<UserStock> criteria = builder.createQuery(UserStock.class);        
        Root<UserStock> member = criteria.from(UserStock.class);
        

       // criteria.select();
        //Constructing list of parameters
        List<Predicate> predicates = new ArrayList<Predicate>();

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        //Adding predicates in case of parameter not being null
        if (accountId != null) {
        	if (!accountId.equals(""))
        		predicates.add(
        				builder.equal(member.get("accountName"), accountId));
        }
        if (deviceId != null) {

        	if (!deviceId.equals(""))
            predicates.add(
            		builder.equal(member.get("deviceId"), deviceId));
        }
        
        criteria.select(member).where(predicates.toArray(new Predicate[]{}));
//        criteria.multiselect(member.get("stockName"), member.get("currentValue")).where(predicates.toArray(new Predicate[]{}));

        return em.createQuery(criteria).getResultList();
		}
     //   return em.createQuery("SELECT stockName, stockLongName,sType,currentValue,upDown,change,changePercent,lastCheckValue,priceHigh,priceLow,notifyCondition,notifyGtValue,notifyLtValue,notifyGtAlert,notifyLtAlert,currentStatusNews,currentStatus,lastMessageDateTime,lastJobDateTime  FROM UserStock").getResultList();
        
        
        //return em.createQuery(criteria).getSingleResult();
    }
	
	@Override
    public List<UserStock> findAllOrderedByName()
    {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserStock> criteria = cb.createQuery(UserStock.class);
        Root<UserStock> member = criteria.from(UserStock.class);

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        criteria.select(member).orderBy(cb.asc(member.get("stocklongname")));
        return em.createQuery(criteria).getResultList();
    }

    public void register(UserStock member)
    {
    	member.setCreateDateTime((new Date()));
    	member.setUpdateDateTime(new Date());
        em.persist(member);
        return;
    }


	@Override
	public void delete(UserStock userStock) {
		// TODO Auto-generated method stub
		em.remove(userStock);
	}


	
    public int removeByAccountDeviceId(String accountId, String deviceId) 
    {
    	try {
			if(accountId.trim().equals("") && deviceId.trim().equals(""))
				return 0;
			else
			{
	
				return em.createQuery("delete from UserStock u "
	        		+ "where u.accountName=:p and u.deviceId=:q").setParameter("p",accountId).setParameter("q", deviceId).executeUpdate();
			}
    	}
    	catch (Exception e)
    	{
    		return -1;
    	}
     }
}
