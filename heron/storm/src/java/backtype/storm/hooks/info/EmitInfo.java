// Copyright 2016 Twitter. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package backtype.storm.hooks.info;

import java.util.Collection;
import java.util.List;

public class EmitInfo {
  public List<Object> values;
  public String stream;
  public int taskId;
  public Collection<Integer> outTasks;

  public EmitInfo(List<Object> values, String stream, int taskId, Collection<Integer> outTasks) {
    this.values = values;
    this.stream = stream;
    this.taskId = taskId;
    this.outTasks = outTasks;
  }

  public EmitInfo(com.twitter.heron.api.hooks.info.EmitInfo info) {
    this.values = info.getValues();
    this.stream = info.getStream();
    this.taskId = info.getTaskId();
    this.outTasks = null;
  }
}
