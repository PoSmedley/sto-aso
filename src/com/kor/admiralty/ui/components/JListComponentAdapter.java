/*******************************************************************************
 * Copyright (C) 2015, 2019 Dave Kor
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *******************************************************************************/
package com.kor.admiralty.ui.components;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JList;

/**
 * Forces a JList to update it's cell height whenever it is shown or resized.
 *
 * @param <E> JList's element type
 */
public class JListComponentAdapter<E> extends ComponentAdapter {
	
	protected JList<E> list;
	
	public JListComponentAdapter(JList<E> list) {
		this.list = list;
	}
	
	@Override
	public void componentResized(ComponentEvent e) {
		// Force recalculation of cell heights after a resize
		list.setFixedCellHeight(10);
		list.setFixedCellHeight(-1);
	}
	
	@Override 
	public void componentShown(ComponentEvent e) {
		// Force recalculation of cell heights after a resize
		list.setFixedCellHeight(10);
		list.setFixedCellHeight(-1);
	}
	
}