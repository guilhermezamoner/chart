/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.Drawable;
import be.ceau.chart.dataset.PieDataset;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PieData implements Drawable {

	private final List<String> labels = new ArrayList<String>();
	private final List<PieDataset> datasets = new ArrayList<PieDataset>();

	/**
	 * @return unmodifiable list of all labels, never {@code null}
	 */
	public List<String> getLabels() {
		return Collections.unmodifiableList(labels);
	}

	public void setLabels(Collection<String> labels) {
		this.labels.clear();
		if (labels != null) {
			this.labels.addAll(labels);
		}
	}

	public void addLabel(String label) {
		this.labels.add(label);
	}

	/**
	 * @return unmodifiable list of all {@link PieDataset} objects, never
	 *         {@code null}
	 */
	public List<PieDataset> getDatasets() {
		return Collections.unmodifiableList(datasets);
	}

	public void setDatasets(Collection<PieDataset> datasets) {
		this.datasets.clear();
		if (datasets != null) {
			this.datasets.addAll(datasets);
		}
	}

	public void addDataset(PieDataset dataset) {
		this.datasets.add(dataset);
	}

	@Override
	public boolean isDrawable() {
		// TODO Auto-generated method stub
		return false;
	}

}
