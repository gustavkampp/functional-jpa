package com.github.davidmoten.fjpa;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagers {
	public static RichEntityManagerFactory enrich(EntityManagerFactory emf) {
		return new RichEntityManagerFactory(emf);
	}

	public static RichEntityManager enrich(EntityManager em) {
		return new RichEntityManager(em);
	}

	public static RichEntityManagerFactory emf(String name) {
		return enrich(Persistence.createEntityManagerFactory(name));
	}

	public static RichEntityManagerFactory emf(String name,
			Map<String, Object> map) {
		return enrich(Persistence.createEntityManagerFactory(name, map));
	}

}