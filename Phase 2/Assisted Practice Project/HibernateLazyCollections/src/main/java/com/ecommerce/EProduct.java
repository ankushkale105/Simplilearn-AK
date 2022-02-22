package com.ecommerce;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Map;


public class EProduct {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;
        private List<Color> colors;
        private Set<Finance> finance;
        private Set<OS> Os;
        public Set<OS> getOs() {
			return Os;
		}
		public void setOs(Set<OS> os) {
			Os = os;
		}
		private Set<ScreenSizes> screensizes;
		public long getID() {
			return ID;
		}
		public void setID(long iD) {
			ID = iD;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public Date getDateAdded() {
			return dateAdded;
		}
		public void setDateAdded(Date dateAdded) {
			this.dateAdded = dateAdded;
		}
		public List<Color> getColors() {
			return colors;
		}
		public void setColors(List<Color> colors) {
			this.colors = colors;
		}
		public Set<Finance> getFinance() {
			return finance;
		}
		public void setFinance(Set<Finance> finance) {
			this.finance = finance;
		}
		public Set<ScreenSizes> getScreensizes() {
			return screensizes;
		}
		public void setScreensizes(Set<ScreenSizes> screensizes) {
			this.screensizes = screensizes;
		}
}
        
        /*public EProduct() {
                
        }
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.dateAdded;}
        public List<Color> getColors() { return this.colors;}
        public Set<Finance> getFinance() { return this.finance;}
        public ScreenSizes getScreenSizes() { return this.screensizes;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date) { this.dateAdded = date;}
        public void setColors(List<Color> colors) { this.colors = colors;}
        public void setFinance(Set<Finance> finance) { this.finance = finance;}
        public void setScreenSizes(ScreenSizes screensizes) { this.screensizes = screensizes;}
}
*/