/**************************************************************************
 * Copyright 2013 by Trixt0r
 * (https://github.com/Trixt0r, Heinrich Reich, e-mail: trixter16@web.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
***************************************************************************/

package com.spriter.draw;


import com.spriter.file.FileLoader;
import com.spriter.file.Reference;

/**
 * An AbstractDrawer is an object which is able to draw an animated entity.
 * To use a drawer, you have to implement {@link #draw(DrawInstruction)} which fits to your environment.
 * @author Trixt0r
 * @param <L> A resource which has been loaded by a concrete #FileLoader. Something like a sprite.
 */
public abstract class AbstractDrawer<L> {
	
	public FileLoader<L> loader;
	
	public AbstractDrawer(FileLoader<L> loader){
		this.loader=loader;
	}
	
	abstract public void draw(DrawInstruction instruction);
	
	protected L getFile(Reference reference){
		return loader.get(reference);
	}
}
