/*
 * Copyright (c) 2012 - Batoo Software Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.batoo.jpa.community.test.querydsl;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.batoo.jpa.annotations.Index;

/**
 * The Class Order.
 */
@Entity
@Table(name = "order_")
public class Order {
	@ManyToOne
	Customer customer;

	@ElementCollection
	@Index(name = "_index")
	List<Integer> deliveredItemIndices;

	@Id
	long id;

	@OneToMany
	@Index(name = "_index")
	List<Item> items, lineItems;

	boolean paid;
}
