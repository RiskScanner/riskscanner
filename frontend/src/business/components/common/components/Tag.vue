<template>
  <el-tag :type="type" :effect="effect" size="mini">{{ content }}</el-tag>
</template>

<script>
/* eslint-disable */
    export default {
      name: "Tag",
      props: {
        type: {
          type: String,
          default: 'primary',
        },
        content: {
          type: String
        },
        effect: {
          type: String,
          default: 'dark',
        }
      }
    }
</script>

<style scoped>

</style>
