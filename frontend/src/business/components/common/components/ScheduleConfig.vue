<template>
  <div class="schedule-config">
    <div>
        <span class="cron-ico" @click="scheduleEdit">
          <i class="el-icon-date" size="small"></i>
          <span class="character">SCHEDULER</span>
        </span>
      <el-switch :disabled="!schedule.value || isReadOnly" v-model="schedule.enable" @change="scheduleChange"/>
      <schedule-edit :is-read-only="isReadOnly" :schedule="schedule" :save="save" :custom-validate="customValidate"
                        ref="scheduleEdit"/>

    </div>
    <div>
        <span>
          {{ $t('schedule.next_execution_time') }}：
          <span :class="{'disable-character': !schedule.enable}"
                v-if="!schedule.enable">{{ $t('schedule.not_set') }}</span>
          <crontab-result v-if="schedule.enable" :enable-simple-mode="true" :ex="schedule.value" ref="crontabResult"/>
        </span>
    </div>
  </div>
</template>

<script>
import ScheduleEdit from "./ScheduleEdit";
import CrontabResult from "../cron/CrontabResult";

function defaultCustomValidate() {
  return {pass: true};
}
/* eslint-disable */
export default {
  name: "ScheduleConfig",
  components: {CrontabResult, ScheduleEdit},
  data() {
    return {
      recentList: [],
    }
  },
  props: {
    save: Function,
    schedule: {},
    checkOpen: {
      type: Function,
      default() {
        return {
          checkOpen() {
            return true;
          }
        }
      }
    },
    customValidate: {
      type: Function,
      default: defaultCustomValidate
    },
    isReadOnly: {
      type: Boolean,
      default: false
    }
  },
  methods: {
    scheduleEdit() {
      if (!this.checkOpen()) {
        return;
      }
      this.$refs.scheduleEdit.open();
    },
    scheduleChange() {
      this.$emit('scheduleChange');
    },
    flashResultList() {
      this.$refs.crontabResult.expressionChange();
    }
  }
}
</script>

<style scoped>

.schedule-config {
  float: right;
  width: 250px;
  height: 15px;
  line-height: 25px;
}

.el-icon-date {
  font-size: 20px;
  margin-left: 5px;
}

.character {
  font-weight: bold;
  margin: 0 5px;
}

.disable-character {
  color: #cccccc;
}

.el-switch {
  margin: 0 5px;
}

.cron-ico {
  cursor: pointer;
}

</style>
