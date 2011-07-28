/*
 * LineTablePresenter.java
 *
 * Copyright (C) 2009-11 by RStudio, Inc.
 *
 * This program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.views.vcs.diff;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.view.client.SelectionChangeEvent;
import org.rstudio.studio.client.common.vcs.VCSServerOperations.PatchMode;
import org.rstudio.studio.client.workbench.views.vcs.events.DiffChunkActionHandler;
import org.rstudio.studio.client.workbench.views.vcs.events.DiffLineActionHandler;

import java.util.ArrayList;

public class LineTablePresenter
{
   public interface Display
   {
      void setData(ArrayList<ChunkOrLine> diffData, PatchMode patchMode);
      void clear();
      ArrayList<Line> getSelectedLines();
      ArrayList<Line> getAllLines();

      HandlerRegistration addDiffChunkActionHandler(DiffChunkActionHandler handler);
      HandlerRegistration addDiffLineActionHandler(DiffLineActionHandler handler);

      HandlerRegistration addSelectionChangeHandler(SelectionChangeEvent.Handler handler);
   }
}
