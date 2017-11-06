package com.qdu.echarts.entities.base;


import org.neo4j.ogm.annotation.GraphId;

/**
 * The abstract entity which contains the basic fields such
 * as id, hashCode and equals function
 */
public abstract class AbstractEntity {

   @GraphId
   private Long ID;

   public Long getId() {
      return ID;
   }

   public void setId(Long id) {
      this.ID = id;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (obj == null) {
         return false;
      }

      if (getClass() != obj.getClass()) {
         return false;
      }

      if (this.ID == null) {
         // For newly created entity, id will be null
         return false;
      }

      AbstractEntity entity = (AbstractEntity) obj;
      return this.ID.equals(entity.ID);
   }

   @Override
   public int hashCode() {
      return ID == null ? super.hashCode() : ID.hashCode();
   }
}