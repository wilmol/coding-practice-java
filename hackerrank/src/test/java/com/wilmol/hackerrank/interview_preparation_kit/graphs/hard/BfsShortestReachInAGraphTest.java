package com.wilmol.hackerrank.interview_preparation_kit.graphs.hard;

import static com.google.common.truth.Truth.assertThat;
import static com.wilmol.hackerrank.interview_preparation_kit.graphs.hard.BfsShortestReachInAGraph.bfsAdjList;
import static com.wilmol.hackerrank.interview_preparation_kit.graphs.hard.BfsShortestReachInAGraph.bfsAdjMatrix;

import org.junit.jupiter.api.Test;

class BfsShortestReachInAGraphTest
{

  @Test
  void list4Node2Edge()
  {
    assertThat(bfsAdjList(new int[][]{
        { 1, 2 },
        { 0 },
        { 0 },
        {}
    }, 0)).isEqualTo(new int[]{ 6, 6, -1 });
  }

  @Test
  void list3Node1Edge()
  {
    assertThat(bfsAdjList(new int[][]{
        {},
        { 2 },
        { 1 }
    }, 1)).isEqualTo(new int[]{ -1, 6 });
  }

  @Test
  void list6Node4Edge()
  {
    assertThat(bfsAdjList(new int[][]{
        { 1, 4 },
        { 0, 2 },
        { 1, 3 },
        { 2 },
        { 0 },
        {}
    }, 0)).isEqualTo(new int[]{ 6, 12, 18, 6, -1 });
  }

  @Test
  void matrix4Node2Edge()
  {
    assertThat(bfsAdjMatrix(new int[][]{
        { 0, 1, 1, 0 },
        { 1, 0, 0, 0 },
        { 1, 0, 0, 0 },
        { 0, 0, 0, 0 }
    }, 0)).isEqualTo(new int[]{ 6, 6, -1 });
  }

  @Test
  void matrix3Node1Edge()
  {
    assertThat(bfsAdjMatrix(new int[][]{
        { 0, 0, 0 },
        { 0, 0, 1 },
        { 0, 1, 0 }
    }, 1)).isEqualTo(new int[]{ -1, 6 });
  }

  @Test
  void matrix6Node4Edge()
  {
    assertThat(bfsAdjMatrix(new int[][]{
        { 0, 1, 0, 0, 1, 0 },
        { 1, 0, 1, 0, 0, 0 },
        { 0, 1, 0, 1, 0, 0 },
        { 0, 0, 1, 0, 0, 0 },
        { 1, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0 }
    }, 0)).isEqualTo(new int[]{ 6, 12, 18, 6, -1 });
  }
}